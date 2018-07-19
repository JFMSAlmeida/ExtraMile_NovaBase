import React from 'react'
import { Link } from 'react-router-dom'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'

const Footer = () => (
  
  <footer class="footer-distributed">
      <div class="footer-left">
        <h3>IST-TagusPark<span> - Group 4</span></h3>
        <p class="footer-links">
          <a href="null"><Link to='/'>Home</Link> </a>
        </p>
        <p class="footer-company-name">ExtraMile IST-NovaBase &copy;2018</p>
      </div>
      <div class="footer-center">
        <div>
          <i class="fa  fa-map-marker"></i>
          <p><span>Avª Prof. Doutor Aníbal Cavaco Silva </span>Oeiras, Portugal</p>
        </div>
        <div>
          <i class="fa fa-envelope"> <FontAwesomeIcon icon="envelope" /></i>
          <p><a href="mailto:example@tecnico.ulisboa.pt">example@tecnico.ulisboa.pt</a></p>
        </div>
      </div>
      <div class="footer-right">
        <p class="footer-company-about">
          <span>About the company:</span>
         One of the best traveler’s independent source of information for finding the ideal adventure.
        </p>
      </div>
    </footer>
 );

export default Footer
