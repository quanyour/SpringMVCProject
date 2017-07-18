package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Hello1Controller��һ������ע��Ŀ�����
 * ����ͬʱ�����������������������ʵ���κνӿ�
 * spring-context-4.3.9.RELEASE.jar/org.springframework.stereotype����ָʾ������һ��������
 * @author Cain
 *
 */
@Controller
public class HelloController {
	private static final Log logger=LogFactory.getLog(HelloController.class);
	
	
	/**
	 * org.springframework.web.bind.annotation.RequestMappingע��
	 * ����ӳ�������URL������ķ����ȣ���������ӳ�䡰/hello��
	 * helloֻ��һ����ͨ�ķ�����
	 * �÷�����������һ����ͼ������ͼ����ģ�͵�ModelAndView����
	 * @return
	 */
	@RequestMapping(value="/test")
	public ModelAndView test(){
		logger.info("hello����������");
		//����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ����ģ�͵������Լ�ģ�Ͷ���
		ModelAndView mv=new ModelAndView();
		//����ģ�����ݣ������������POJO����
		mv.addObject("message","Hello World,This is my first MVCProject Annotation");
		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		//����ModelAndView����
		return mv;
	}
}