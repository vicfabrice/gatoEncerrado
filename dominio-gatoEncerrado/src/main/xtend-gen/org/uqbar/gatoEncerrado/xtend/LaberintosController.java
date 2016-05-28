package org.uqbar.gatoEncerrado.xtend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.omg.CORBA.UserException;
import org.uqbar.gatoEncerrado.Accion;
import org.uqbar.gatoEncerrado.Juego;
import org.uqbar.gatoEncerrado.Laberinto;
import org.uqbar.xtrest.api.Result;
import org.uqbar.xtrest.api.XTRest;
import org.uqbar.xtrest.api.annotation.Controller;
import org.uqbar.xtrest.api.annotation.Get;
import org.uqbar.xtrest.json.JSONUtils;
import org.uqbar.xtrest.result.ResultFactory;

/**
 * @author Grupo10 - Victoria - Alan
 */
@Controller
@SuppressWarnings("all")
public class LaberintosController extends ResultFactory {
  @Extension
  private JSONUtils _jSONUtils = new JSONUtils();
  
  @Get("/suma/:primerNumero/:segundoNumero")
  public Result suma(final String primerNumero, final String segundoNumero, final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) {
    Result _xblockexpression = null;
    {
      response.setContentType("application/json");
      final Integer n1 = Integer.valueOf(primerNumero);
      final Integer n2 = Integer.valueOf(segundoNumero);
      _xblockexpression = ResultFactory.ok((("{ \'total\' : \'" + Integer.valueOf(((n1).intValue() + (n2).intValue()))) + "\'}"));
    }
    return _xblockexpression;
  }
  
  @Get("/laberintos/:participanteId")
  public Result laberintos(final String participanteId, final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) {
    Result _xblockexpression = null;
    {
      response.setContentType("application/json");
      final Integer idParticipante = Integer.valueOf(participanteId);
      final ArrayList<Laberinto> laberintos = Juego.getLaberintosParaParticipante(idParticipante);
      String _json = this._jSONUtils.toJson(laberintos);
      _xblockexpression = ResultFactory.ok(_json);
    }
    return _xblockexpression;
  }
  
  @Get("/laberinto/:laberintoId/:participanteId")
  public Result iniciarLaberinto(final String laberinto, final String participante, final String laberintoId, final String participanteId, final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) {
    Result _xblockexpression = null;
    {
      response.setContentType("application/json");
      final Integer idParticipante = Integer.valueOf(participanteId);
      final Integer idLaberinto = Integer.valueOf(laberintoId);
      Result _xtrycatchfinallyexpression = null;
      try {
        Laberinto _laberinto = Juego.getLaberinto(idParticipante, idLaberinto);
        String _json = this._jSONUtils.toJson(_laberinto);
        _xtrycatchfinallyexpression = ResultFactory.ok(_json);
      } catch (final Throwable _t) {
        if (_t instanceof UserException) {
          final UserException e = (UserException)_t;
          _xtrycatchfinallyexpression = ResultFactory.notFound(((("No existe laberinto con el id " + idLaberinto) + " para el participante con id ") + idParticipante));
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  @Get("/realizar-accion/:idHabitacion/:idAccion/:idParticipante")
  public Result getRealizarAccion(final String idHabitacion, final String idAccion, final String idParticipante, final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) {
    Result _xblockexpression = null;
    {
      response.setContentType("application/json");
      final Integer habitacionId = Integer.valueOf(idHabitacion);
      final Integer accionId = Integer.valueOf(idAccion);
      final Integer participanteId = Integer.valueOf(idParticipante);
      Result _xtrycatchfinallyexpression = null;
      try {
        Result _xblockexpression_1 = null;
        {
          final Accion resultadoRealizarAccion = Juego.realizarAccion(accionId, habitacionId, participanteId);
          _xblockexpression_1 = ResultFactory.ok("{ status : \'ok\' }");
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof UserException) {
          final UserException e = (UserException)_t;
          return ResultFactory.notFound((("No se puede realizar accion \'" + idAccion) + "\'"));
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    XTRest.start(LaberintosController.class, 9000);
  }
  
  public void handle(final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
    {
    	Matcher matcher = 
    		Pattern.compile("/suma/(\\w+)/(\\w+)").matcher(target);
    	if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches()) {
    		// take parameters from request
    		
    		// take variables from url
    		String primerNumero = matcher.group(1);
    		String segundoNumero = matcher.group(2);
    		
    		
    	    Result result = suma(primerNumero, segundoNumero, target, baseRequest, request, response);
    	    result.process(response);
    	    
    		response.addHeader("Access-Control-Allow-Origin", "*");
    	    baseRequest.setHandled(true);
    	    return;
    	}
    }
    {
    	Matcher matcher = 
    		Pattern.compile("/laberintos/(\\w+)").matcher(target);
    	if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches()) {
    		// take parameters from request
    		
    		// take variables from url
    		String participanteId = matcher.group(1);
    		
    		
    	    Result result = laberintos(participanteId, target, baseRequest, request, response);
    	    result.process(response);
    	    
    		response.addHeader("Access-Control-Allow-Origin", "*");
    	    baseRequest.setHandled(true);
    	    return;
    	}
    }
    {
    	Matcher matcher = 
    		Pattern.compile("/laberinto/(\\w+)/(\\w+)").matcher(target);
    	if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches()) {
    		// take parameters from request
    		String laberinto = request.getParameter("laberinto");
    		String participante = request.getParameter("participante");
    		
    		// take variables from url
    		String laberintoId = matcher.group(1);
    		String participanteId = matcher.group(2);
    		
    		
    	    Result result = iniciarLaberinto(laberinto, participante, laberintoId, participanteId, target, baseRequest, request, response);
    	    result.process(response);
    	    
    		response.addHeader("Access-Control-Allow-Origin", "*");
    	    baseRequest.setHandled(true);
    	    return;
    	}
    }
    {
    	Matcher matcher = 
    		Pattern.compile("/realizar-accion/(\\w+)/(\\w+)/(\\w+)").matcher(target);
    	if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches()) {
    		// take parameters from request
    		
    		// take variables from url
    		String idHabitacion = matcher.group(1);
    		String idAccion = matcher.group(2);
    		String idParticipante = matcher.group(3);
    		
    		
    	    Result result = getRealizarAccion(idHabitacion, idAccion, idParticipante, target, baseRequest, request, response);
    	    result.process(response);
    	    
    		response.addHeader("Access-Control-Allow-Origin", "*");
    	    baseRequest.setHandled(true);
    	    return;
    	}
    }
    this.pageNotFound(baseRequest, request, response);
  }
  
  public void pageNotFound(final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
    response.getWriter().write(
    	"<html><head><title>XtRest - Page Not Found!</title></head>" 
    	+ "<body>"
    	+ "	<h1>Page Not Found !</h1>"
    	+ "	Supported resources:"
    	+ "	<table>"
    	+ "		<thead><tr><th>Verb</th><th>URL</th><th>Parameters</th></tr></thead>"
    	+ "		<tbody>"
    	+ "			<tr>"
    	+ "				<td>GET</td>"
    	+ "				<td>/suma/:primerNumero/:segundoNumero</td>"
    	+ "				<td>primerNumero, segundoNumero</td>"
    	+ "			</tr>"
    	+ "			<tr>"
    	+ "				<td>GET</td>"
    	+ "				<td>/laberintos/:participanteId</td>"
    	+ "				<td>participanteId</td>"
    	+ "			</tr>"
    	+ "			<tr>"
    	+ "				<td>GET</td>"
    	+ "				<td>/laberinto/:laberintoId/:participanteId</td>"
    	+ "				<td>laberinto, participante, laberintoId, participanteId</td>"
    	+ "			</tr>"
    	+ "			<tr>"
    	+ "				<td>GET</td>"
    	+ "				<td>/realizar-accion/:idHabitacion/:idAccion/:idParticipante</td>"
    	+ "				<td>idHabitacion, idAccion, idParticipante</td>"
    	+ "			</tr>"
    	+ "		</tbody>"
    	+ "	</table>"
    	+ "</body>"
    );
    response.setStatus(404);
    baseRequest.setHandled(true);
  }
}
