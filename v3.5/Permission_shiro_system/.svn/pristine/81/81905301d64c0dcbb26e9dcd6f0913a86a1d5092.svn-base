package cn.luo.ssm.controller.propertyeditor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

/**
 * 
 *<p>Title:CustomPropertyEditor </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2016-12-21
 */
public class CustomPropertyEditor implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"), true));
		
	}

}
