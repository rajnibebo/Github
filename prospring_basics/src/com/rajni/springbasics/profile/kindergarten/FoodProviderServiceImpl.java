/**
 * 
 */
package com.rajni.springbasics.profile.kindergarten;

import java.util.ArrayList;
import java.util.List;

import com.rajni.springbasics.profile.Food;
import com.rajni.springbasics.profile.FoodProviderService;

/**
 * @author rajni.ubhi
 *
 */
public class FoodProviderServiceImpl implements FoodProviderService{

	@Override
	public List<Food> provideLunchSet() {
		// TODO Auto-generated method stub
		List<Food> lunchSet = new ArrayList<Food>();
		lunchSet.add(new Food("Milk"));
		lunchSet.add(new Food("Biscuits"));
		return lunchSet;
	}

}
