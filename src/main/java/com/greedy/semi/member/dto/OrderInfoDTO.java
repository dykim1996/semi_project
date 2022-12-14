package com.greedy.semi.member.dto;


import java.util.Date;


import com.greedy.semi.trade.dto.TradeDTO;

import lombok.Data;

@Data
public class OrderInfoDTO {
	private Long orderCode;
	private MemberDTO member;
	private ProductDTO product;
	private TradeDTO trade;
	private Date orderDate;
	private Date expirationDate;

}
