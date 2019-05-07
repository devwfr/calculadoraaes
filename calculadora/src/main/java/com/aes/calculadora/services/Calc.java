package com.aes.calculadora.services;

import com.aes.calculadora.model.Operando;
import com.aes.calculadora.model.Resultado;
import com.aes.calculadora.support.ResponseDelegate;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/calc")
public interface Calc {
  @GET
  @Path("/test")
  @Produces("application/json")
  GetCalcAddResponse getCalcPr();  
    
  @GET
  @Path("/add")
  @Produces("application/json")
  GetCalcAddResponse getCalcAdd(@QueryParam("num1") int num1, @QueryParam("num2") int num2);

  @DELETE
  @Path("/sub")
  @Produces("application/json")
  @Consumes("application/json")
  DeleteCalcSubResponse deleteCalcSub(Operando entity);

  @POST
  @Path("/mul")
  @Produces("application/json")
  @Consumes("application/json")
  PostCalcMulResponse postCalcMul(Operando entity);

  @PUT
  @Path("/div")
  @Produces("application/json")
  PutCalcDivResponse putCalcDiv(@QueryParam("num1") int num1, @QueryParam("num2") int num2);

  class GetCalcAddResponse extends ResponseDelegate {
    private GetCalcAddResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetCalcAddResponse(Response response) {
      super(response);
    }

    public static GetCalcAddResponse respond200WithApplicationJson(Resultado entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetCalcAddResponse(responseBuilder.build(), entity);
    }
  }

  class DeleteCalcSubResponse extends ResponseDelegate {
    private DeleteCalcSubResponse(Response response, Object entity) {
      super(response, entity);
    }

    private DeleteCalcSubResponse(Response response) {
      super(response);
    }

    public static DeleteCalcSubResponse respond200WithApplicationJson(Resultado entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteCalcSubResponse(responseBuilder.build(), entity);
    }
  }

  class PostCalcMulResponse extends ResponseDelegate {
    private PostCalcMulResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostCalcMulResponse(Response response) {
      super(response);
    }

    public static PostCalcMulResponse respond200WithApplicationJson(Resultado entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostCalcMulResponse(responseBuilder.build(), entity);
    }
  }

  class PutCalcDivResponse extends ResponseDelegate {
    private PutCalcDivResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PutCalcDivResponse(Response response) {
      super(response);
    }

    public static PutCalcDivResponse respond200WithApplicationJson(Resultado entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PutCalcDivResponse(responseBuilder.build(), entity);
    }
  }
}
