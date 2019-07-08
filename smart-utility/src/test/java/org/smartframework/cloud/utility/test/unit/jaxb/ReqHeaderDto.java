package org.smartframework.cloud.utility.test.unit.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * UIP请求报文节点SvcInfo——Header
 *
 * @author liyulin
 * @date 2018年12月13日下午10:12:37
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Header")
public class ReqHeaderDto {

	@XmlElement(name = "TOKEN")
	private String token;

	@XmlElement(name = "TIMESTRAMP")
	private String timestramp;

}