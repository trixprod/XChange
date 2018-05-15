package org.knowm.xchange.paymium;

import java.io.IOException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.knowm.xchange.paymium.dto.account.PaymiumBalanceResponse;
import si.mazi.rescu.ParamsDigest;
import si.mazi.rescu.SynchronizedValueFactory;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface PaymiumAuthenticated extends Paymium {

  @GET
  @Path("user")
  PaymiumBalanceResponse getBalance(
      @HeaderParam("Api-Key") String apiKey,
      @HeaderParam("Api-Signature") ParamsDigest sszsz,
      @HeaderParam("Api-Nonce") SynchronizedValueFactory<Long> nonce)
      throws IOException;
}