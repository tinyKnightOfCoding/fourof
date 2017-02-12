package ch.tkoc.fx

import javafx.scene.layout.Pane
import org.junit.Test
import org.junit.Assert.*


class ViewTest {

    @Test
    fun view_withoutRootConstruct() {
        val view = TestViewWithoutRootConstruct()
        assertNotNull(view.root)
        assertTrue(view.root is Pane)
        assertNotNull(view.element)
    }

    @Test
    fun view_wrongId() {
        try {
            val view = TestViewWrongId()
            view.element2
            fail()
        } catch(ex: IllegalArgumentException) {
            assertEquals("Property element2 could not be found in namespace", ex.message)
        }
    }

    @Test
    fun view_wrongType() {
        try {
            val view = TestViewWrongType()
            view.element
            fail()
        } catch(ex: IllegalArgumentException) {
            assertEquals("Property element is not of type javafx.scene.control.ListView<kotlin.Any>", ex.message)
        }
    }

    @Test
    fun view_witController() {
        val view = TestViewWithController()
        view.element
    }
}