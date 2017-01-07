/**
 * 
 */
package com.trantor.leavesys.entities.adapter;

/**
 * @author rajni.ubhi
 *
 */
public interface IEntityConverter<M, E> {
	public E convertModelToEntity(M model);

	public M convertEntityToModel(E entity);

	public E convertModelToEntityUsingID(M model);
}
