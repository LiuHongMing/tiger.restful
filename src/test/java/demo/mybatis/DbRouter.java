package demo.mybatis;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DbRouter extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }

}
