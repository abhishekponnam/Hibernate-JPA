package com.abhishek.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.abhishek.dao.EmployeeDAO;
import com.abhishek.entity.EmployeeEntity;

public class EmployeeDAOImpl extends EmployeeEntity implements EmployeeDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	public List<EmployeeEntity> executeNamedQuery(int deptNo) {
		// TODO Auto-generated method stub
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = entityManager.createNamedQuery("query1", EmployeeEntity.class);
		tq.setParameter(1, deptNo);
		List<EmployeeEntity> lst = tq.getResultList();
		entityManager.close();
		return lst;
	}

	public List executeNamedNativeQuery(int sal) {
		// TODO Auto-generated method stub
		EntityManager entityManager = factory.createEntityManager();
		Query q = entityManager.createNamedQuery("query2");
		q.setParameter(1, sal);
		List lst = q.getResultList();
		entityManager.close();
		return lst;
	}

	public List<EmployeeEntity> executeCriteriaQuery() {

		EntityManager em = factory.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<EmployeeEntity> q = cb.createQuery(EmployeeEntity.class);

		Root<EmployeeEntity> r = q.from(EmployeeEntity.class);

		q.select(r).where(cb.equal(r.get("salary"), 3000));
//		q.select(r).where(cb.and(cb.gt(r.get("salary"), 3000), cb.le(r.get("salary"),6000)));
		// above line is not implementing due to mismatch of generic expression.
	/*	Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			The method gt(Expression<? extends Number>, Expression<? extends Number>) in the type CriteriaBuilder is not applicable for the arguments (Path<Object>, int)
			The method le(Expression<? extends Number>, Expression<? extends Number>) in the type CriteriaBuilder is not applicable for the arguments (Path<Object>, int)

			at com.abhishek.dao.impl.EmployeeDAOImpl.executeCriteriaQuery(EmployeeDAOImpl.java:51)
			at com.abhishek.client.App.main(App.java:24)
*/

		Query query = em.createQuery(q);
		List<EmployeeEntity> lst = query.getResultList();
		em.close();

		return lst;
	}

}
