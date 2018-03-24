package cn.luo.ssm.controller.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 *<p>Title:CustomDateConverter </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2016-12-21
 */
public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		
		try {
			//进行日期转换
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
