package org.dromara.system.domain.convert;

import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.vo.RemoteDictDataVo;
import org.dromara.system.domain.vo.SysDictDataVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDictDataVoConvertImpl implements SysDictDataVoConvert {

    @Override
    public RemoteDictDataVo convert(SysDictDataVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RemoteDictDataVo remoteDictDataVo = new RemoteDictDataVo();

        remoteDictDataVo.setCreateTime( arg0.getCreateTime() );
        remoteDictDataVo.setCssClass( arg0.getCssClass() );
        remoteDictDataVo.setDictCode( arg0.getDictCode() );
        remoteDictDataVo.setDictLabel( arg0.getDictLabel() );
        remoteDictDataVo.setDictSort( arg0.getDictSort() );
        remoteDictDataVo.setDictType( arg0.getDictType() );
        remoteDictDataVo.setDictValue( arg0.getDictValue() );
        remoteDictDataVo.setIsDefault( arg0.getIsDefault() );
        remoteDictDataVo.setListClass( arg0.getListClass() );
        remoteDictDataVo.setRemark( arg0.getRemark() );

        return remoteDictDataVo;
    }

    @Override
    public RemoteDictDataVo convert(SysDictDataVo arg0, RemoteDictDataVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setCssClass( arg0.getCssClass() );
        arg1.setDictCode( arg0.getDictCode() );
        arg1.setDictLabel( arg0.getDictLabel() );
        arg1.setDictSort( arg0.getDictSort() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setDictValue( arg0.getDictValue() );
        arg1.setIsDefault( arg0.getIsDefault() );
        arg1.setListClass( arg0.getListClass() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
