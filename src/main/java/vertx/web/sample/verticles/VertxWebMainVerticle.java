package vertx.web.sample.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.CompositeFuture;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.ext.web.Router;
import vertx.web.sample.verticles.http.client.HttpClientVerticle;
import vertx.web.sample.verticles.product.ProductVerticle;

/**
 * @author s2it_agomes
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 9/5/17 2:08 PM
 */
public class VertxWebMainVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> done) {
        vertx.deployVerticle(new ProductVerticle());
        vertx.deployVerticle(new HttpClientVerticle());
    }
}
