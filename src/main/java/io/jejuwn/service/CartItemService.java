package io.jejuwn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.jejuwn.model.CartItem;

public interface CartItemService {
	
	// 모든 장바구니 보기
	public List<CartItem> getAllCartItemList();
	// 내 장바구니 목록보기	
<<<<<<< HEAD
	// public CartItem getCartItemList(Long cartId);
	// 장바구니 추가
	public void carItemInsert(CartItem vo);
	// 장바구니 삭제
	public void cartItemDelete(Long id);
=======
	public CartItem getCartItemList(Long cId);
	// 장바구니 추가
	public void carItemInsert(CartItem vo);
	// 장바구니 삭제
	public void cartItemDelete(Long ciId);
>>>>>>> origin/merge_prep
}
