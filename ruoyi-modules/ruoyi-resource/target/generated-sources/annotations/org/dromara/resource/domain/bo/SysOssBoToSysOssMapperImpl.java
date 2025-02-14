package org.dromara.resource.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.resource.domain.SysOss;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:41+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOssBoToSysOssMapperImpl implements SysOssBoToSysOssMapper {

    @Override
    public SysOss convert(SysOssBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOss sysOss = new SysOss();

        sysOss.setCreateBy( arg0.getCreateBy() );
        sysOss.setCreateDept( arg0.getCreateDept() );
        sysOss.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysOss.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysOss.setSearchValue( arg0.getSearchValue() );
        sysOss.setUpdateBy( arg0.getUpdateBy() );
        sysOss.setUpdateTime( arg0.getUpdateTime() );
        sysOss.setFileName( arg0.getFileName() );
        sysOss.setFileSuffix( arg0.getFileSuffix() );
        sysOss.setOriginalName( arg0.getOriginalName() );
        sysOss.setOssId( arg0.getOssId() );
        sysOss.setService( arg0.getService() );
        sysOss.setUrl( arg0.getUrl() );

        return sysOss;
    }

    @Override
    public SysOss convert(SysOssBo source, SysOss target) {
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
        target.setFileName( source.getFileName() );
        target.setFileSuffix( source.getFileSuffix() );
        target.setOriginalName( source.getOriginalName() );
        target.setOssId( source.getOssId() );
        target.setService( source.getService() );
        target.setUrl( source.getUrl() );

        return target;
    }
}
