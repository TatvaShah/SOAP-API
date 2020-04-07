/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Tatva
 */
@Provider
public class Cors implements ContainerResponseFilter{

    @Override
    public void filter(ContainerRequestContext creqc, ContainerResponseContext cresc1) throws IOException {
        cresc1.getHeaders().add("Access-Control-Allow-Origin", "*");
        cresc1.getHeaders().add("Access-Control-Allow-Headers","origin,content-type,accept,authorization");
        cresc1.getHeaders().add("Access-Control-Allow-Credentials","true");
        cresc1.getHeaders().add("Access-Control-Allow-Methods","GET");
        cresc1.getHeaders().add("Access-Control-Max-Age","1209600");
    }
    
}
