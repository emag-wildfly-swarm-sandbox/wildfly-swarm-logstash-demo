package wildflyswarm.logstash;

import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class MyController {

  private static final Logger LOG = Logger.getLogger(MyController.class);

  @GET
  @Path("/info")
  public String info() {
    LOG.info("info");
    return "info";
  }

  @GET
  @Path("/warn")
  public String warn() {
    LOG.warn("warn");
    return "warn";
  }

  @GET
  @Path("/error")
  public String error() {
    LOG.error("error");
    return "error";
  }

}
