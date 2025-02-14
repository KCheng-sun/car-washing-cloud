package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysPost;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysPostBoToSysPostMapperImpl implements SysPostBoToSysPostMapper {

    @Override
    public SysPost convert(SysPostBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPost sysPost = new SysPost();

        sysPost.setCreateBy( arg0.getCreateBy() );
        sysPost.setCreateDept( arg0.getCreateDept() );
        sysPost.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysPost.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysPost.setSearchValue( arg0.getSearchValue() );
        sysPost.setUpdateBy( arg0.getUpdateBy() );
        sysPost.setUpdateTime( arg0.getUpdateTime() );
        sysPost.setPostCode( arg0.getPostCode() );
        sysPost.setPostId( arg0.getPostId() );
        sysPost.setPostName( arg0.getPostName() );
        sysPost.setPostSort( arg0.getPostSort() );
        sysPost.setRemark( arg0.getRemark() );
        sysPost.setStatus( arg0.getStatus() );

        return sysPost;
    }

    @Override
    public SysPost convert(SysPostBo source, SysPost target) {
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
        target.setPostCode( source.getPostCode() );
        target.setPostId( source.getPostId() );
        target.setPostName( source.getPostName() );
        target.setPostSort( source.getPostSort() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
