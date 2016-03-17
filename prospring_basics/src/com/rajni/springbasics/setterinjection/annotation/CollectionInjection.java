/**
 * 
 */
package com.rajni.springbasics.setterinjection.annotation;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * @author rajni.ubhi
 *
 */
@Service("collection")
class CollectionInjection {
	@Resource(name="maps")
	private Map<String, Object> maps;
	@Resource(name="sets")
	private Set sets;
	@Resource(name="props")
	private Properties props;
	@Resource(name="list")
	private List<String> list;

	/**
	 * @return the maps
	 */
	public Map<String, Object> getMaps() {
		return maps;
	}

	/**
	 * @param maps the maps to set
	 */
	public void setMaps(Map<String, Object> maps) {
		System.out.println("setMaps()!!!!!!!");
		this.maps = maps;
	}

	/**
	 * @return the sets
	 */
	public Set getSets() {
		return sets;
	}

	/**
	 * @param sets the sets to set
	 */
	public void setSets(Set sets) {
		this.sets = sets;
	}

	/**
	 * @return the props
	 */
	public Properties getProps() {
		return props;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
	}

	/**
	 * @return the list
	 */
	public List getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List list) {
		this.list = list;
	}
	
	public String toString() {
		return "Map : "+maps+" , list :  "+list+" , Sets: "+sets;
	}
	
}
