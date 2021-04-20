/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloBD.exceptions.NonexistentEntityException;
import ModeloBD.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ModeloUML.Empresa;
import ModeloUML.Acontecimiento;
import ModeloUML.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author leora
 */
public class PersonaJpaController implements Serializable {

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) throws Exception {
        if (persona.getAcontecimientoList() == null) {
            persona.setAcontecimientoList(new ArrayList<Acontecimiento>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empresa idempresa = persona.getIdempresa();
            if (idempresa != null) {
                idempresa = em.getReference(idempresa.getClass(), idempresa.getId());
                persona.setIdempresa(idempresa);
            }
            List<Acontecimiento> attachedAcontecimientoList = new ArrayList<Acontecimiento>();
            for (Acontecimiento acontecimientoListAcontecimientoToAttach : persona.getAcontecimientoList()) {
                acontecimientoListAcontecimientoToAttach = em.getReference(acontecimientoListAcontecimientoToAttach.getClass(), acontecimientoListAcontecimientoToAttach.getNombre());
                attachedAcontecimientoList.add(acontecimientoListAcontecimientoToAttach);
            }
            persona.setAcontecimientoList(attachedAcontecimientoList);
            em.persist(persona);
            if (idempresa != null) {
                idempresa.getPersonaList().add(persona);
                idempresa = em.merge(idempresa);
            }
            for (Acontecimiento acontecimientoListAcontecimiento : persona.getAcontecimientoList()) {
                acontecimientoListAcontecimiento.getPersonaList().add(persona);
                acontecimientoListAcontecimiento = em.merge(acontecimientoListAcontecimiento);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getDni()) != null) {
                throw new PreexistingEntityException("Persona " + persona + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getDni());
            Empresa idempresaOld = persistentPersona.getIdempresa();
            Empresa idempresaNew = persona.getIdempresa();
            List<Acontecimiento> acontecimientoListOld = persistentPersona.getAcontecimientoList();
            List<Acontecimiento> acontecimientoListNew = persona.getAcontecimientoList();
            if (idempresaNew != null) {
                idempresaNew = em.getReference(idempresaNew.getClass(), idempresaNew.getId());
                persona.setIdempresa(idempresaNew);
            }
            List<Acontecimiento> attachedAcontecimientoListNew = new ArrayList<Acontecimiento>();
            for (Acontecimiento acontecimientoListNewAcontecimientoToAttach : acontecimientoListNew) {
                acontecimientoListNewAcontecimientoToAttach = em.getReference(acontecimientoListNewAcontecimientoToAttach.getClass(), acontecimientoListNewAcontecimientoToAttach.getNombre());
                attachedAcontecimientoListNew.add(acontecimientoListNewAcontecimientoToAttach);
            }
            acontecimientoListNew = attachedAcontecimientoListNew;
            persona.setAcontecimientoList(acontecimientoListNew);
            persona = em.merge(persona);
            if (idempresaOld != null && !idempresaOld.equals(idempresaNew)) {
                idempresaOld.getPersonaList().remove(persona);
                idempresaOld = em.merge(idempresaOld);
            }
            if (idempresaNew != null && !idempresaNew.equals(idempresaOld)) {
                idempresaNew.getPersonaList().add(persona);
                idempresaNew = em.merge(idempresaNew);
            }
            for (Acontecimiento acontecimientoListOldAcontecimiento : acontecimientoListOld) {
                if (!acontecimientoListNew.contains(acontecimientoListOldAcontecimiento)) {
                    acontecimientoListOldAcontecimiento.getPersonaList().remove(persona);
                    acontecimientoListOldAcontecimiento = em.merge(acontecimientoListOldAcontecimiento);
                }
            }
            for (Acontecimiento acontecimientoListNewAcontecimiento : acontecimientoListNew) {
                if (!acontecimientoListOld.contains(acontecimientoListNewAcontecimiento)) {
                    acontecimientoListNewAcontecimiento.getPersonaList().add(persona);
                    acontecimientoListNewAcontecimiento = em.merge(acontecimientoListNewAcontecimiento);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = persona.getDni();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            Empresa idempresa = persona.getIdempresa();
            if (idempresa != null) {
                idempresa.getPersonaList().remove(persona);
                idempresa = em.merge(idempresa);
            }
            List<Acontecimiento> acontecimientoList = persona.getAcontecimientoList();
            for (Acontecimiento acontecimientoListAcontecimiento : acontecimientoList) {
                acontecimientoListAcontecimiento.getPersonaList().remove(persona);
                acontecimientoListAcontecimiento = em.merge(acontecimientoListAcontecimiento);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Persona findPersona(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
