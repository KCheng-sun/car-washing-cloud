package org.dromara.demo.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestTree;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:37+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class TestTreeVoToTestTreeMapperImpl implements TestTreeVoToTestTreeMapper {

    @Override
    public TestTree convert(TestTreeVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestTree testTree = new TestTree();

        testTree.setCreateTime( arg0.getCreateTime() );
        testTree.setDeptId( arg0.getDeptId() );
        testTree.setId( arg0.getId() );
        testTree.setParentId( arg0.getParentId() );
        testTree.setTreeName( arg0.getTreeName() );
        testTree.setUserId( arg0.getUserId() );

        return testTree;
    }

    @Override
    public TestTree convert(TestTreeVo source, TestTree target) {
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
