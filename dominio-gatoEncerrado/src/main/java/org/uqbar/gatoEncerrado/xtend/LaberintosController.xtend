package org.uqbar.gatoEncerrado.xtend

import org.uqbar.xtrest.api.XTRest
import org.uqbar.xtrest.api.annotation.Controller
import org.uqbar.xtrest.api.annotation.Get
//import org.uqbar.xtrest.api.annotation.Post
import org.uqbar.xtrest.json.JSONUtils
import org.uqbar.gatoEncerrado.Juego
import org.omg.CORBA.UserException

/**
 * 
 * @author Grupo10 - Victoria - Alan
 */
@Controller
class LaberintosController {
    extension JSONUtils = new JSONUtils
    

    @Get("/suma/:primerNumero/:segundoNumero")
    def suma() {
        response.contentType = "application/json"
       	val n1 = Integer.valueOf(primerNumero)
       	val n2 = Integer.valueOf(segundoNumero) 
        ok("{ 'total' : '" +  (n1 + n2) + "'}" )
    }
    
    @Get("/laberintos/:participanteId")
    def laberintos() {
        response.contentType = "application/json"
        val idParticipante = Integer.valueOf(participanteId) 
        val laberintos = Juego.getLaberintosParaParticipante(idParticipante)
        ok(laberintos.toJson)
    }
     

    @Get('/laberinto/:laberintoId/:participanteId')
    def iniciarLaberinto(String laberinto, String participante) {
        response.contentType = "application/json"
        val idParticipante = Integer.valueOf(participanteId)
        val idLaberinto = Integer.valueOf(laberintoId)
        
        try {
        	// Devuelve un laberinto o primer habitacion
            ok(Juego.getLaberinto(idParticipante, idLaberinto).toJson)
        }
        catch (UserException e) {
            notFound("No existe laberinto con el id " + idLaberinto + " para el participante con id " + idParticipante );
        }
    }

    @Get('/realizar-accion/:idHabitacion/:idAccion/:idParticipante')
    def getRealizarAccion() {
            response.contentType = "application/json"
            val habitacionId = Integer.valueOf(idHabitacion)
            val accionId = Integer.valueOf(idAccion)
            val participanteId = Integer.valueOf(idParticipante)
            
        try {
            val resultadoRealizarAccion = Juego.realizarAccion(accionId, habitacionId, participanteId)
            // Devolver lo que resulta como json
            ok("{ status : 'ok' }");
        }
        catch (UserException e) {
            return notFound("No se puede realizar accion '" + idAccion + "'");
        }
    }

    def static void main(String[] args) {
        XTRest.start(LaberintosController, 9000)
    }
}
