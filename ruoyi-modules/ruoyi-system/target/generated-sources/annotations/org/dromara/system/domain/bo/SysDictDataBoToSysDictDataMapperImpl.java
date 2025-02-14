package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysDictData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDictDataBoToSysDictDataMapperImpl implements SysDictDataBoToSysDictDataMapper {

    @Override
    public SysDictData convert(SysDictDataBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictData sysDictData = new SysDictData();

        sysDictData.setCreateBy( arg0.getCreateBy() );
        sysDictData.setCreateDept( arg0.getCreateDept() );
        sysDictData.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysDictData.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysDictData.setSearchValue( arg0.getSearchValue() );
        sysDictData.setUpdateBy( arg0.getUpdateBy() );
        sysDictData.setUpdateTime( arg0.getUpdateTime() );
        sysDictData.setCssClass( arg0.getCssClass() );
        sysDictData.setDictCode( arg0.getDictCode() );
        sysDictData.setDictLabel( arg0.getDictLabel() );
        sysDictData.setDictSort( arg0.getDictSort() );
        sysDictData.setDictType( arg0.getDictType() );
        sysDictData.setDictValue( arg0.getDictValue() );
        sysDictData.setIsDefault( arg0.getIsDefault() );
        sysDictData.setListClass( arg0.getListClass() );
        sysDictData.setRemark( arg0.getRemark() );

        return sysDictData;
    }

    @Override
    public SysDictData convert(SysDictDataBo source, SysDictData target) {
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
        target.setCssClass( source.getCssClass() );
        target.setDictCode( source.getDictCode() );
        target.setDictLabel( source.getDictLabel() );
        target.setDictSort( source.getDictSort() );
        target.setDictType( source.getDictType() );
        target.setDictValue( source.getDictValue() );
        target.setIsDefault( source.getIsDefault() );
        target.setListClass( source.getListClass() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
