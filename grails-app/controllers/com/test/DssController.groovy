package com.test

class DssController {

    def dssService

    def index() {
        render dssService.verify()
    }
}
