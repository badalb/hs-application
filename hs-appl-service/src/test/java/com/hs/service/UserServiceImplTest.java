package com.hs.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hs.domain.User;
import com.hs.repository.UserRepository;


public class UserServiceImplTest {

	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	@Before
	public void setUp() throws Exception {
		 MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		User user = new User();
		user.setEmail("test@test.com");
		List<User> users = Arrays.asList(user);
		when(userServiceImpl.findAllUsers()).thenReturn(users);
		
		List<User> result = userServiceImpl.findAllUsers();
		assertTrue(result != null);
		assertEquals(1, result.size());
	}

}
