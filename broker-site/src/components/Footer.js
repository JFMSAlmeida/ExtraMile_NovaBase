import React from 'react'
import { Link } from 'react-router-dom'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'

const Footer = () => (
  
  <footer class="footer-distributed">

      <div class="footer-left">

        <h3>RRR<span>-Gang</span></h3>

        <p class="footer-links">
          <a href="#"><Link to='/'>Home</Link> </a>

          <span> · </span>

          <a href="#"><Link to='/about'>About</Link> </a>

          <span> ·     </span>
           
          <a href="#"><Link to='/faq'>Faq</Link></a>

        </p>

        <p class="footer-company-name">Trivago &copy;2018</p>
      </div>

      <div class="footer-center">

        <div>
          <i class="fa  fa-map-marker"></i>
          <p><span>Avª Prof. Doutor Aníbal Cavaco Silva </span>Oeiras, Portugal</p>
        </div>

        <div>
          <i class="fa fa-phone"><FontAwesomeIcon icon="phone" /> </i>
          <p>+351 267 454 564</p>
        </div>

        <div>
          <i class="fa fa-envelope"> <FontAwesomeIcon icon="envelope" /></i>
          <p><a href="mailto:RRR@trivago.com">RRR@trivago.com</a></p>
        </div>

      </div>

      <div class="footer-right">

        <p class="footer-company-about">
          <span>About the company</span>
         One of the best traveler’s independent source of information for finding the ideal adventure.
        </p>


      </div>

    </footer>


 )

export default Footer


 /* <div id="footerContainer">
      <footer>
          <ul  target="_blank">
            <li><Link to="/About Us" className="grey-text text-lighten-3">About Us</Link></li>
            <li><Link to="/Terms & Conditions" className="grey-text text-lighten-3">Terms & Conditions</Link></li>
            <li><Link to="/Help" className="grey-text text-lighten-3">Help</Link></li>
            <li><Link to="/Contact Us" className="grey-text text-lighten-3">Contact Us</Link></li>
          </ul>
      </footer>
  </div>
*/