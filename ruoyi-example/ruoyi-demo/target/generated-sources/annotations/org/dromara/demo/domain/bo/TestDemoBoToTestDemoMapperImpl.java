package org.dromara.demo.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestDemo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:37+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class TestDemoBoToTestDemoMapperImpl implements TestDemoBoToTestDemoMapper {

    @Override
    public TestDemo convert(TestDemoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestDemo testDemo = new TestDemo();

        testDemo.setCreateBy( arg0.getCreateBy() );
        testDemo.setCreateDept( arg0.getCreateDept() );
        testDemo.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            testDemo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        testDemo.setSearchValue( arg0.getSearchValue() );
        testDemo.setUpdateBy( arg0.getUpdateBy() );
        testDemo.setUpdateTime( arg0.getUpdateTime() );
        testDemo.setDeptId( arg0.getDeptId() );
        testDemo.setId( arg0.getId() );
        testDemo.setOrderNum( arg0.getOrderNum() );
        testDemo.setTestKey( arg0.getTestKey() );
        testDemo.setUserId( arg0.getUserId() );
        testDemo.setValue( arg0.getValue() );

        return testDemo;
    }

    @Override
    public TestDemo convert(TestDemoBo source, TestDemo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateDept( source.getCreateDept() );
        target.setCreateTime( source.getCreateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        target.setSearchValue( source.getSearchValue() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setDeptId( source.getDeptId() );
        target.setId( source.getId() );
        target.setOrderNum( source.getOrderNum() );
        target.setTestKey( source.getTestKey() );
        target.setUserId( source.getUserId() );
        target.setValue( source.getValue() );

        return target;
    }
}
