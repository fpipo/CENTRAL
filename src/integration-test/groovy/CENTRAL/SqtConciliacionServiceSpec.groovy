package CENTRAL

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SqtConciliacionServiceSpec extends Specification {

    SqtConciliacionService sqtConciliacionService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new SqtConciliacion(...).save(flush: true, failOnError: true)
        //new SqtConciliacion(...).save(flush: true, failOnError: true)
        //SqtConciliacion sqtConciliacion = new SqtConciliacion(...).save(flush: true, failOnError: true)
        //new SqtConciliacion(...).save(flush: true, failOnError: true)
        //new SqtConciliacion(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //sqtConciliacion.id
    }

    void "test get"() {
        setupData()

        expect:
        sqtConciliacionService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<SqtConciliacion> sqtConciliacionList = sqtConciliacionService.list(max: 2, offset: 2)

        then:
        sqtConciliacionList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        sqtConciliacionService.count() == 5
    }

    void "test delete"() {
        Long sqtConciliacionId = setupData()

        expect:
        sqtConciliacionService.count() == 5

        when:
        sqtConciliacionService.delete(sqtConciliacionId)
        sessionFactory.currentSession.flush()

        then:
        sqtConciliacionService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        SqtConciliacion sqtConciliacion = new SqtConciliacion()
        sqtConciliacionService.save(sqtConciliacion)

        then:
        sqtConciliacion.id != null
    }
}
