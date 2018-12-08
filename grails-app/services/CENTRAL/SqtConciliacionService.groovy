package CENTRAL

import grails.gorm.services.Service

@Service(SqtConciliacion)
interface SqtConciliacionService {

    SqtConciliacion get(Serializable id)

    List<SqtConciliacion> list(Map args)

    Long count()

    void delete(Serializable id)

    SqtConciliacion save(SqtConciliacion sqtConciliacion)

}