package org.dromara.demo.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestTree;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:30:40+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class TestTreeBoToTestTreeMapperImpl implements TestTreeBoToTestTreeMapper {

    @Override
    public TestTree convert(TestTreeBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestTree testTree = new TestTree();

        testTree.setCreateBy( arg0.getCreateBy() );
        testTree.setCreateDept( arg0.getCreateDept() );
        testTree.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            testTree.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        testTree.setSearchValue( arg0.getSearchValue() );
        testTree.setUpdateBy( arg0.getUpdateBy() );
        testTree.setUpdateTime( arg0.getUpdateTime() );
        testTree.setDeptId( arg0.getDeptId() );
        testTree.setId( arg0.getId() );
        testTree.setParentId( arg0.getParentId() );
        testTree.setTreeName( arg0.getTreeName() );
        testTree.setUserId( arg0.getUserId() );

        return testTree;
    }

    @Override
    public TestTree convert(TestTreeBo source, TestTree target) {
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
        target.setParentId( source.getParentId() );
        target.setTreeName( source.getTreeName() );
        target.setUserId( source.getUserId() );

        return target;
    }
}
