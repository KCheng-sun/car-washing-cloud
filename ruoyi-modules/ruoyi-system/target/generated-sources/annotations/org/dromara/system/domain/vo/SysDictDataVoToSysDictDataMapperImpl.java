package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysDictData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDictDataVoToSysDictDataMapperImpl implements SysDictDataVoToSysDictDataMapper {

    @Override
    public SysDictData convert(SysDictDataVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictData sysDictData = new SysDictData();

        sysDictData.setCreateTime( arg0.getCreateTime() );
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
    public SysDictData convert(SysDictDataVo source, SysDictData target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
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
