package org.dromara.demo.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestDemo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:37+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class TestDemoVoToTestDemoMapperImpl implements TestDemoVoToTestDemoMapper {

    @Override
    public TestDemo convert(TestDemoVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestDemo testDemo = new TestDemo();

        if ( arg0.getCreateBy() != null ) {
            testDemo.setCreateBy( Long.parseLong( arg0.getCreateBy() ) );
        }
        testDemo.setCreateTime( arg0.getCreateTime() );
        if ( arg0.getUpdateBy() != null ) {
            testDemo.setUpdateBy( Long.parseLong( arg0.getUpdateBy() ) );
        }
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
    public TestDemo convert(TestDemoVo source, TestDemo target) {
        if ( source == null ) {
            return target;
        }

        if ( source.getCreateBy() != null ) {
            target.setCreateBy( Long.parseLong( source.getCreateBy() ) );
        }
        else {
            target.setCreateBy( null );
        }
        target.setCreateTime( source.getCreateTime() );
        if ( source.getUpdateBy() != null ) {
            target.setUpdateBy( Long.parseLong( source.getUpdateBy() ) );
        }
        else {
            target.setUpdateBy( null );
        }
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
