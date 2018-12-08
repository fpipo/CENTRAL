package CENTRAL

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class SqtConciliacionController {

    SqtConciliacionService sqtConciliacionService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond sqtConciliacionService.list(params), model:[sqtConciliacionCount: sqtConciliacionService.count()]
    }

    def show(Long id) {
        respond sqtConciliacionService.get(id)
    }

    def create() {
        respond new SqtConciliacion(params)
    }

    def save(SqtConciliacion sqtConciliacion) {
        if (sqtConciliacion == null) {
            notFound()
            return
        }

        try {
            sqtConciliacionService.save(sqtConciliacion)
        } catch (ValidationException e) {
            respond sqtConciliacion.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sqtConciliacion.label', default: 'SqtConciliacion'), sqtConciliacion.id])
                redirect sqtConciliacion
            }
            '*' { respond sqtConciliacion, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond sqtConciliacionService.get(id)
    }

    def update(SqtConciliacion sqtConciliacion) {
        if (sqtConciliacion == null) {
            notFound()
            return
        }

        try {
            sqtConciliacionService.save(sqtConciliacion)
        } catch (ValidationException e) {
            respond sqtConciliacion.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'sqtConciliacion.label', default: 'SqtConciliacion'), sqtConciliacion.id])
                redirect sqtConciliacion
            }
            '*'{ respond sqtConciliacion, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        sqtConciliacionService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'sqtConciliacion.label', default: 'SqtConciliacion'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sqtConciliacion.label', default: 'SqtConciliacion'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
