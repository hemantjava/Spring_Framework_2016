import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.AbstractFormController;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import org.springframework.web.servlet.mvc.BaseCommandController;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
/*Controller interface is root of controllers. it  has one  abstract method handleRequest()*/
 class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		return null;
	}

}
 /*AbstractController is abstract  class and it has one abstract method handleRequestInternal()*/
 class MyAbstrsctController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		return null;
	}}
 /*MultiActionController concrete classs*/
 class MyMultiActionController extends MultiActionController{}
 /*BaseCommandController is deprecated abstract class it has one abstract method handleRequestInternal()*/
class MyBaseCommandController extends BaseCommandController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		return null;
	}}
/*AbstractController is abstract class it has one abstract method handleRequestInternal*/
class MyAbstractCommandController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		return null;
	}}
/*AbstractFormController is deprecated abstract class it has two methods processFormSubmission(4)
and showForm(3)*/
class MyAbstractFormController extends AbstractFormController{

	@Override
	protected ModelAndView processFormSubmission(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		return null;
	}

	@Override
	protected ModelAndView showForm(HttpServletRequest arg0,
			HttpServletResponse arg1, BindException arg2) throws Exception {
		return null;
	}}
/*SimpleFormController is deprecated concrete class*/
class MySimpleFormController extends SimpleFormController{}
/*AbstractWizardFormController is deprecated abstract class is has one abstract processFinish(4)*/
class MyAbstractWizardFormController extends AbstractWizardFormController{

	@Override
	protected ModelAndView processFinish(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		return null;
	}}
