import { StrictMode } from 'react'
import  React from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'

const raectElement = React.createElement(
  'a',
  {href:"https://google.com",target:'_blank'},
  "google "
)
createRoot(document.getElementById('root')).render(
  raectElement
)
