package org.dromara.demo.domain;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.vo.TestDemoVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:37+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class TestDemoToTestDemoVoMapperImpl implements TestDemoToTestDemoVoMapper {

    @Override
    public TestDemoVo convert(TestDemo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestDemoVo testDemoVo = new TestDemoVo();

        if ( arg0.getCreateBy() != null ) {
            testDemoVo.setCreateBy( String.valueOf( arg0.getCreateBy() ) );
        }
        testDemoVo.setCreateTime( arg0.getCreateTime() );
        testDemoVo.setDeptId( arg0.getDeptId() );
        testDemoVo.setId( arg0.getId() );
        testDemoVo.setOrderNum( arg0.getOrderNum() );
        testDemoVo.setTestKey( arg0.getTestKey() );
        if ( arg0.getUpdateBy() != null ) {
            testDemoVo.setUpdateBy( String.valueOf( arg0.getUpdateBy() ) );
        }
        testDemoVo.setUpdateTime( arg0.getUpdateTime() );
        testDemoVo.setUserId( arg0.getUserId() );
        testDemoVo.setValue( arg0.getValue() );

        return testDemoVo;
    }

    @Override
    public TestDemoVo convert(TestDemo source, TestDemoVo target) {
        if ( source == null ) {
            return target;
        }

        if ( source.getCreateBy() != null ) {
            target.setCreateBy( String.valueOf( source.getCreateBy() ) );
        }
        else {
            target.setCreateBy( null );
        }
        target.setCreateTime( source.getCreateTime() );
        target.setDeptId( source.getDeptId() );
        target.setId( source.getId() );
        target.setOrderNum( source.getOrderNum() );
        target.setTestKey( source.getTestKey() );
        if ( source.getUpdateBy() != null ) {
            target.setUpdateBy( String.valueOf( source.getUpdateBy() ) );
        }
        else {
            target.setUpdateBy( null );
        }
        target.setUpdateTime( source.getUpdateTime() );
        target.setUserId( source.getUserId() );
        target.setValue( source.getValue() );

        return target;
    }
}
