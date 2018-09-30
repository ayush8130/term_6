package com.niit.shopbackend.dao;

import java.util.List;

import com.niit.shopbackend.model.UserDetails;

public interface UserDetailsRepository {
	public boolean addUserDetails(UserDetails userdetails);
    public boolean updateUserDetails(UserDetails userdetails);
    public boolean deleteUserDetails(int userdetailsId);
    public List<UserDetails> getAllUserDetails();
    public UserDetails getUserDetailsById(int userdetailsId);

}
