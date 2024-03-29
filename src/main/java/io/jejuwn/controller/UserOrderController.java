package io.jejuwn.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jejuwn.model.UserOrder;
import io.jejuwn.service.UserOrderService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/userorder")
public class UserOrderController {
	
	@Autowired
	private UserOrderService service;
	
	// insert
	@PostMapping(value="", consumes="application/json",
							produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> insert(
			@RequestBody UserOrder vo){
		
		ResponseEntity<String> entity = null;
		try {
			service.userOrderInsert(vo);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch(Exception e) {
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	// update
	@RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH},
					value="/{id}",
					consumes="application/json",
					produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> update (
			@RequestBody UserOrder vo,
			@PathVariable("id") Long id){
		
		ResponseEntity<String> entity = null;
		try {
			vo.setId(id);
			service.userOrderUpdate(vo);
			
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	// delete
	@DeleteMapping(value="/{id}",
							produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String>  delete(
			@PathVariable("id") Long id) {
				ResponseEntity<String> entity = null;
				
				try {
					
					service.userOrderDelete(id);
					entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
				} catch(Exception e) {
					entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
				}
				return entity;
			}
	
	// 유저 전체를 가져오는 메서드
	@GetMapping(value="/list",
				produces= {MediaType.APPLICATION_XML_VALUE,
						MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<List<UserOrder>> list() {
		ResponseEntity<List<UserOrder>> entity = null;
		
		try {
			entity = new ResponseEntity<>(service.getAllUserOrderList(), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	// 내 예약 불러오는 메서드
	@GetMapping(value="/list/{userId}",
			produces= {MediaType.APPLICATION_XML_VALUE,
						MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<List<UserOrder>> list (
			@PathVariable("userId") Long userId) {
		
			ResponseEntity<List<UserOrder>> entity = null;
			
			try {
				entity = new ResponseEntity<>(
						service.userOrderList(userId), HttpStatus.OK);			
			} catch(Exception e) {
				e.printStackTrace();
				entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			return entity;
			}
	
}
