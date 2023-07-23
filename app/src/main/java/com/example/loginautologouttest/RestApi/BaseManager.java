package com.example.loginautologouttest.RestApi;

public class BaseManager {

    protected RestApi getRestApiUser()
    {
        RestApiClient restApiClient = new RestApiClient(BaseUrl.URLuser);
        return restApiClient.getRestApi();
    }

}
