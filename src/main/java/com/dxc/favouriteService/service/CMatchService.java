package com.dxc.favouriteService.service;

import java.util.List;

import com.dxc.favouriteService.domain.CMatch;
import com.dxc.favouriteService.domain.User;
import com.dxc.favouriteService.exception.CMatchAlreadyExistsException;
import com.dxc.favouriteService.exception.CMatchNotFoundException;
import com.dxc.favouriteService.exception.UserAlreadyExistsException;
import com.dxc.favouriteService.exception.UserCreationException;
import com.dxc.favouriteService.exception.UserNotFoundException;

public interface CMatchService {

	public User registerUser(User user) throws UserAlreadyExistsException, UserCreationException;
	
	public User saveCMatchToFavorites(CMatch cmatch,String userName) throws CMatchAlreadyExistsException, UserNotFoundException;
	
	public User deleteCMatchFromFavorites(CMatch cmatch,String userName) throws UserNotFoundException, CMatchNotFoundException;
	
	public List<CMatch> getAllMatchesFromFavorites(String userName) throws UserNotFoundException;	
	
	
}
