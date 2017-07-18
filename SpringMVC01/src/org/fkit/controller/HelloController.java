package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * HelloController��һ��ʵ��Controller�ӿڵĿ�����
 * ���Դ���һ����һ��������
 * @author Cain
 *
 */
public class HelloController implements Controller{

	private static final Log logger=LogFactory.getLog(HelloController.class);
	
	/**
	 * handlerRequest��Controller����ʵ�ֵķ���
	 * �÷����Ĳ����Ƕ�Ӧ��HttpServletRequest��HttpServletResponse
	 * �÷������뷵��һ��������ͼ������ͼ����ģ�͵�ModelAndView����
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("handleRequest������");
		//����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ����ģ�͵������Լ�ģ�Ͷ���
		ModelAndView mv=new ModelAndView();
		//����ģ�����ݣ������������POJO����
		mv.addObject("message","Hello World,This is my first MVCProject");
		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		//����ModelAndView����
		return mv;
	}

	

}