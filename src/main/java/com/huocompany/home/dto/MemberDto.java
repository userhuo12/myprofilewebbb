package com.huocompany.home.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
		
		private String mid;// 아이디 
		private String mpw;// 비밀번호 
		private String mname;
		private String memail;
		private String mdate;

}
