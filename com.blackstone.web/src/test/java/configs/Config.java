package configs;

public class Config {
    private String BASE_URL="https://oyn-adminportal-qc-demo.salmonsky-1edff179.westeurope.azurecontainerapps.io/identity/login";

    public String getBASE_URL(){
        return BASE_URL;
    }
    public void setBASE_URL(String base_url){
        BASE_URL=base_url;

    }
}
