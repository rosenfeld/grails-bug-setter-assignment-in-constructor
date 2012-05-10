package setter

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {
    def params = [email: 'abc', password: 'def']

    @Test
    void usingConstructor() {
        def user = new User(params)
        commonAssertions(user)
    }

    @Test
    void usingRegularClass() {
        def user = new RegularUser(params)
        commonAssertions(user)
    }

    @Test
    void usingProperties() {
        def user = new User()
        user.properties['email', 'password'] = params
        commonAssertions(user)
    }

    def commonAssertions(user) {
        assert user.email == 'abc'
        assert user.passwordHash == 'abcdef'
    }
}
