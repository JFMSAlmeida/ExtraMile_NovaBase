import React from 'react'
import Header from './Header'
import Main from './Main'
import Footer from './Footer'


import { library } from '@fortawesome/fontawesome-svg-core'

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faMapMarkerAlt } from '@fortawesome/free-solid-svg-icons'
import { faEnvelope} from '@fortawesome/free-solid-svg-icons'
import { faPhone} from '@fortawesome/free-solid-svg-icons'



library.add(faMapMarkerAlt)
library.add(faEnvelope)
library.add(faPhone)


const App = () => (
    <div>
        <Header />
        <Main />
        <Footer />
    </div>
)

export default App
