package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysPost;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysPostVoToSysPostMapperImpl implements SysPostVoToSysPostMapper {

    @Override
    public SysPost convert(SysPostVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPost sysPost = new SysPost();

        sysPost.setCreateTime( arg0.getCreateTime() );
        sysPost.setPostCode( arg0.getPostCode() );
        sysPost.setPostId( arg0.getPostId() );
        sysPost.setPostName( arg0.getPostName() );
        sysPost.setPostSort( arg0.getPostSort() );
        sysPost.setRemark( arg0.getRemark() );
        sysPost.setStatus( arg0.getStatus() );

        return sysPost;
    }

    @Override
    public SysPost convert(SysPostVo source, SysPost target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setPostCode( source.getPostCode() );
        target.setPostId( source.getPostId() );
        target.setPostName( source.getPostName() );
        target.setPostSort( source.getPostSort() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
