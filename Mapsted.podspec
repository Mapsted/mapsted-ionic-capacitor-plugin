require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name = 'Mapsted'
  s.version = package['version']
  s.summary = package['description']
  s.license = package['license']
  s.homepage = package['repository']['url']
  s.author = package['author']
  s.source = { :git => package['repository']['url'], :tag => s.version.to_s }
  s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp,storyboard}'
  s.ios.deployment_target  = '13.0'
  s.dependency 'Capacitor'
  s.dependency 'mapsted-sdk-map-ui', '~> 5.0'  # Add your dependency here
  s.swift_version = '5.1'
  # Add additional sources
  s.source = { :http => 'https://cdn.cocoapods.org/', :git => 'https://github.com/Mapsted/podspec-simulator.git' }
end
