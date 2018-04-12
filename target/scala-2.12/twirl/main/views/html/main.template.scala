
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        """),format.raw/*15.62*/("""
        """),format.raw/*16.9*/("""<title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">

        <script type='text/javascript' src='"""),_display_(/*19.46*/routes/*19.52*/.Assets.versioned("javascripts/jquery-3.3.1.js")),format.raw/*19.100*/("""'></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*20.55*/routes/*20.61*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*20.107*/("""">
        <script type='text/javascript' src='"""),_display_(/*21.46*/routes/*21.52*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*21.97*/("""'></script>
    </head>
    <body>
        <div class="container">
            """),format.raw/*26.36*/("""
            """),_display_(/*27.14*/content),format.raw/*27.21*/("""
        """),format.raw/*28.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 14:05:08 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/Ghajarieh Sepanlou-my-first-app/app/views/main.scala.html
                  HASH: bd55db9c0fc1374d1f9c8ae69b5ad70ac1faf021
                  MATRIX: 1206->260|1330->291|1357->292|1546->506|1582->515|1617->523|1643->528|1737->595|1752->601|1813->640|1889->689|1904->695|1974->743|2067->809|2082->815|2150->861|2225->909|2240->915|2306->960|2413->1133|2454->1147|2482->1154|2518->1163
                  LINES: 33->7|38->8|39->9|45->15|46->16|46->16|46->16|47->17|47->17|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|55->26|56->27|56->27|57->28
                  -- GENERATED --
              */
          