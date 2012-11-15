package com.test

import grails.converters.JSON

class DssController {

    def dssService

    def index() {
        render dssService.verify() as JSON
    }
}
