package org.dromara.demo.domain;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.vo.TestTreeVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:30:40+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class TestTreeToTestTreeVoMapperImpl implements TestTreeToTestTreeVoMapper {

    @Override
    public TestTreeVo convert(TestTree arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestTreeVo testTreeVo = new TestTreeVo();

        testTreeVo.setCreateTime( arg0.getCreateTime() );
        testTreeVo.setDeptId( arg0.getDeptId() );
        testTreeVo.setId( arg0.getId() );
        testTreeVo.setParentId( arg0.getParentId() );
        testTreeVo.setTreeName( arg0.getTreeName() );
        testTreeVo.setUserId( arg0.getUserId() );

        return testTreeVo;
    }

    @Override
    public TestTreeVo convert(TestTree source, TestTreeVo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setDeptId( source.getDeptId() );
        target.setId( source.getId() );
        target.setParentId( source.getParentId() );
        target.setTreeName( source.getTreeName() );
        target.setUserId( source.getUserId() );

        return target;
    }
}
