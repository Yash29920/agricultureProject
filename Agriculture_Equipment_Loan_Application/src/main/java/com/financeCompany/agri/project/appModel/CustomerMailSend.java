package com.financeCompany.agri.project.appModel;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMailSend {

    @Value("${mail.from}")
	private String from;
	private String to;
	private String sub;
	private String msg;
}
